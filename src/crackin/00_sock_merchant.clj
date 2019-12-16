;https://www.hackerrank.com/challenges/sock-merchant
(ns crackin.00-sock-merchant)

(defn find-pairs [socks]
  (let [grouped-socks-raw (group-by (fn [x] x) socks)
        grouped-socks (map second grouped-socks-raw)
        grouped-socks-count (map count grouped-socks)
        grouped-socks-pairs (map #(quot % 2) grouped-socks-count)]
    (reduce + grouped-socks-pairs)))
    
(defn execute [n ar]
  (-> (find-pairs ar)
    (:pairs)))
