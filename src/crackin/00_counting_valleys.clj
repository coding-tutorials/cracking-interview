;https://www.hackerrank.com/challenges/counting-valleys
(ns crackin.00-counting-valleys)

(defn count-valleys [steps]
  (reduce
    (fn [[acc-level acc-valleys] step]
      (let [level (if (= \U step) (inc acc-level) (dec acc-level))
            valleys (if (and (= acc-level -1) (= level 0)) (inc acc-valleys) acc-valleys)]
        [level valleys]))
    [0 0]
    steps))

(defn execute [n s]
  (second (count-valleys s)))
