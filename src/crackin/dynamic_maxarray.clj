;https://www.hackerrank.com/challenges/max-array-sum
(ns crackin.dynamic-maxarray)

(defn execute [arr]
  (second
    (reduce
      (fn [[i max imax] n]
        (let [back2-max (if (> i 1) (nth imax (- i 2)) nil)
              me-plus-back2-max (if (nil? back2-max) nil (+ n back2-max))
              new-i (inc i)
              mmax (if (nil? me-plus-back2-max)
                     nil
                     (if (> me-plus-back2-max max)
                       me-plus-back2-max
                       (if (> n max)
                         n
                         max)))]
          (cond
            (= i 0) [new-i n (conj imax n)]
            (= i 1) [new-i (if (> n max) n max) (conj imax (if (> n max) n max))]
            (> i 1) [new-i mmax (conj imax mmax)]
            :else [new-i max])))
      [0 0 []]
      arr)))
  
