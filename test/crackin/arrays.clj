(ns crackin.arrays
  (:require [clojure.test :as test])
  (:require [crackin.array-2d :as array-2d])
  (:require [crackin.array-rotation :as rotation]))

(test/deftest array-2d-test
  (let [input [[1 1 1 0 0 0] [0 1 0 0 0 0] [1 1 1 0 0 0] [0 0 2 4 4 0] [0 0 0 2 0 0] [0 0 1 2 4 0]]
        expected-output 19
        result (apply array-2d/execute [input])]
    (test/is (= result expected-output))))

(test/deftest rotation-test
  (let [input  [[1 2 3 4 5] 4]
        expected-output [5 1 2 3 4]
        result (apply rotation/execute input)]
    (test/is (= result expected-output))))
