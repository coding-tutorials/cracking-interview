;https://www.hackerrank.com/challenges/two-strings
(ns crackin.dictionaries-strings)

(defn execute [s1 s2]
  (let [[short long] (map distinct (sort-by count [s1 s2]))]
    (reduce
      (fn [_ char]
        (if (some #(= char %) long)
          (reduced "YES")
          "NO"))
      "NO"
      short)))

