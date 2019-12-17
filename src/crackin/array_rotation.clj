;https://www.hackerrank.com/challenges/ctci-array-left-rotation
(ns crackin.array-rotation)

(defn execute [array n]
  (concat (drop n array) (take n array)))

     
