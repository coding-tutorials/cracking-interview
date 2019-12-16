;https://www.hackerrank.com/challenges/repeated-string
(ns crackin.00-repeated-string)

(defn execute [s n]
  (let [string-count (count s)
        string-quot (quot n string-count)
        string-rem (rem n string-count)
        string-as (clojure.string/replace s #"[^a]" "")
        perfect-as (* string-quot (count string-as))
        left-string (subs s 0 string-rem)
        left-as (count (clojure.string/replace left-string #"[^a]" ""))]
    (+ perfect-as left-as)))
