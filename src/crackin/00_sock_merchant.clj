;https://www.hackerrank.com/challenges/sock-merchant
(ns crackin.00-sock-merchant)

(defn remove-from-list [list position]
  (let [first-part (take position list)
        second-part (drop (inc position) list)]
    (concat first-part second-part)))

(defn find-pairs [socks]
  (reduce
    (fn [acc sock]
      (let [odd-socks (:odd-socks acc)]
        (if (some #(= sock %) odd-socks)
          (let [position (.indexOf odd-socks sock)
                odd-socks-without-sock (remove-from-list odd-socks position)
                pairs (inc (:pairs acc))]
            (assoc acc :pairs pairs :odd-socks odd-socks-without-sock))
          (assoc acc :odd-socks (conj odd-socks sock)))))
    {:pairs 0 :odd-socks []}
    socks))

(defn execute [n ar]
  (-> (find-pairs ar)
    (:pairs)))
