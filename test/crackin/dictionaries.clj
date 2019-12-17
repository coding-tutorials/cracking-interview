(ns crackin.arrays
  (:require [clojure.test :as test])
  (:require [crackin.dictionaries-strings :as strings]))

(test/deftest array-2d-test
  (let [input-1 ["hello" "world"]
        input-2 ["hi" "world"]
        expected-output-1 "YES"
        expected-output-2 "NO"
        result-1 (apply strings/execute [input-1])
        result-2 (apply strings/execute [input-2])]
    (test/is (= result-1 expected-output-1))
    (test/is (= result-2 expected-output-2))))
