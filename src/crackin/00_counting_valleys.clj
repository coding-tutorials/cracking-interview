;https://www.hackerrank.com/challenges/counting-valleys
(ns crackin.00-counting-valleys)

(defn count-valleys [steps]
  (reduce
    (fn [acc step]
      (let [original-level (:level acc)
            level (if (= "U" step) (inc original-level) (dec original-level))
            valleys (if (and (= original-level -1) (= level 0)) (inc (:valleys acc)) (:valleys acc))]
        (assoc acc :level level :valleys valleys)))
    {:level 0 :valleys 0}
    steps))

(defn execute [n s]
  (let [steps (clojure.string/split s #"")]
    (:valleys (count-valleys steps))))
