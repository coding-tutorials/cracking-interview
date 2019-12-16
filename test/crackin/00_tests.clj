(ns crackin.00-tests
  (:require [clojure.test :as test])
  (:require [crackin.00-sock-merchant :as sock-merchant]))

(test/deftest sock-merchant-test
  (let [input [9 [10 20 20 10 10 30 50 10 20]]
        expected-output 3
        result (apply sock-merchant/execute input)]
    (test/is (= result expected-output))))
