;https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
(ns crackin.greedy-difference)

(defn absolute-distance [a b]
  (let [distance (cond
                   (and (neg? a) (neg? b)) (+ (* -1 a) b)
                   (and (pos? a) (pos? b)) (- a b)
                   :else (+ (* -1 a) b))]
    (if (< distance 0) (* -1 distance) distance)))
    
(defn execute [arr]
  (let [list (sort arr)]
    (reduce
      (fn [minimum i]
        (if (= i (dec (count list)))
          (reduced minimum)
          (let [me (nth list i)
                next (nth list (inc i))]
            (min minimum (absolute-distance me next)))))
      1000000
      (range (count list)))))
