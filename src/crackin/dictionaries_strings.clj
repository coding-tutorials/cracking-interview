;https://www.hackerrank.com/challenges/two-strings
(ns crackin.dictionaries-strings)

(defn execute [s1 s2]
  (reduce
    (fn [common? char]
      (if (clojure.string/includes? s2 (.toString char))
        (reduced "YES")
        "NO"))
    "NO"
    (seq s1)))
