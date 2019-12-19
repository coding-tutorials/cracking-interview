(ns crackin.greedy
  (:require [clojure.test :as test])
  (:require [crackin.greedy-difference :as difference]))

(test/deftest difference-test
  (let [input [-59 -36 -13 1 -53 -92 -2 -96 -54 75]
        expected-output 1
        result (apply difference/execute [input])]
    (test/is (= result expected-output))))
