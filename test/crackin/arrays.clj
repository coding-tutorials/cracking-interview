(ns crackin.arrays
  (:require [clojure.test :as test])
  (:require [crackin.array-hourglass :as hourglass]))

(test/deftest hourglass-test
  (let [input [[1 1 1 0 0 0] [0 1 0 0 0 0] [1 1 1 0 0 0] [0 0 2 4 4 0] [0 0 0 2 0 0] [0 0 1 2 4 0]]
        expected-output 19
        result (apply hourglass/execute [input])]
    (test/is (= result expected-output))))