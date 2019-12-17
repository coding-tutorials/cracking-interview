;https://www.hackerrank.com/challenges/2d-array
(ns crackin.array-2d)

(defn read-hourglass [v h lists]
  (let [a-row (drop h (nth lists (+ 0 v)))
        b-row (drop h (nth lists (+ 1 v)))
        c-row (drop h (nth lists (+ 2 v)))
        a-houglass (take 3 a-row)
        b-houglass (take 1 (drop 1 b-row))
        c-houglass (take 3 c-row)]
    (+ (reduce + a-houglass) (reduce + b-houglass) (reduce + c-houglass))))

(def minimum-value -1000)

(defn reduce-horizontal [vertical array]
  (reduce
    (fn [max horizontal]
      (let [h-sum (read-hourglass vertical horizontal array)]
        
        (if (> h-sum max) h-sum max)))
    minimum-value
    (range 4)))

(defn execute [array]
  (reduce
    (fn [max vertical]
      (let [sum (reduce-horizontal vertical array)]
        (if (> sum max) sum max)))
    minimum-value
    (range 4)))

     
