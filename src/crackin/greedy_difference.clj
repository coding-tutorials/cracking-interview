;https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
(ns crackin.greedy-difference)

(defn absolute-distance [a b]
  (let [distance (cond
                   (and (neg? a) (neg? b)) (+ (* -1 a) b)
                   (and (pos? a) (pos? b)) (- a b)
                   :else (+ (* -1 a) b))]
    (if (< distance 0) (* -1 distance) distance)))
    
(defn min-number [arr number-index]
  (reduce
    (fn [minimum arr-index]
      (if (= arr-index number-index)
        minimum
        (let [number (nth arr number-index)
              current (nth arr arr-index)
              distance (absolute-distance number current)]
          (min distance minimum))))
    1000000
    (range 0 (count arr))))

(defn execute [arr]
  (reduce
    (fn [minimum i]
      (let [min-distance (min-number arr i)]
        (min min-distance minimum)))
    1000000
    (range 0 (count arr))))
