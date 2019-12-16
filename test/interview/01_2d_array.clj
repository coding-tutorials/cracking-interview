(ns interview.01-2d-array
  (:require [clojure.test :refer :all]))

(def array [[1 1 1 0 0 0] [0 1 0 0 0 0] [1 1 1 0 0 0] [0 0 2 4 4 0] [0 0 0 2 0 0] [0 0 1 2 4 0]])

(def hourglass-size 3)

(defn hourglass [array h-index v-index]
  (let [lines (subvec array (+ 0 v-index) (+ 3 v-index))
        first-line (subvec (nth lines 0) h-index (+ 3 h-index))
        second-number (first (subvec (nth lines 1) (+ 1 h-index) (+ 2 h-index)))
        third-line (subvec (nth lines 2) h-index (+ 3 h-index))]
    [first-line second-number third-line]))

(defn sum-hourglass [[first second third]]
 (+ (reduce + first) second (reduce + third)))

(defn loop-hourglasses-vertical [h v-length]
  (loop [v 0 v-hourglasses []]
    (if (<= v (- v-length hourglass-size))
      (let [v-hourglass (hourglass array h v)]
        (recur (inc v) (conj v-hourglasses v-hourglass)))
      v-hourglasses)))

(defn loop-hourglasses-horizontal [h-length v-length]
  (loop [h 0 h-hourglasses []]
    (if (<= h (- h-length hourglass-size))
      (let [v-hourglasses (loop-hourglasses-vertical h v-length)]
        (recur (inc h)  (concat h-hourglasses v-hourglasses)))
      h-hourglasses)))

(defn loop-hourglasses-sums [array]
  (let [h-length (count (first array))
        v-length (count array)
        hourglasses (loop-hourglasses-horizontal h-length v-length)
        sums (map #(sum-hourglass %) hourglasses)]
    ;(println hourglasses)
    sums))

(defn solution []
  (reduce max (loop-hourglasses-sums array)))
  

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 19 (solution)))))
