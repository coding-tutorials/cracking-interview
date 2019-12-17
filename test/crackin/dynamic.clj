(ns crackin.dynamic
  (:require [clojure.test :as test])
  (:require [crackin.dynamic-maxarray :as dynamic-maxarray]))

(test/deftest dynamic-maxarray-test
  (let [input [-2 1 3 -4 5]
        expected-output 8
        result (apply dynamic-maxarray/execute [input])]
    (test/is (= result expected-output))))
