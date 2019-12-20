;https://www.hackerrank.com/challenges/alternating-characters
(ns crackin.strings-alternating)

(defn execute [s]
  (first
    (reduce
      (fn [[n last] c]
        (if (= last c)
          [(inc n) c]
          [n c]))
      [0 ""]
      (seq s))))
