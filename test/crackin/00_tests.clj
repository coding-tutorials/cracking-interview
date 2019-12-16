(ns crackin.00-tests
  (:require [clojure.test :as test])
  (:require [crackin.00-sock-merchant :as sock-merchant])
  (:require [crackin.00-counting-valleys :as counting-valleys]))

(test/deftest sock-merchant-test
  (let [input [9 [10 20 20 10 10 30 50 10 20]]
        expected-output 3
        result (apply sock-merchant/execute input)]
    (test/is (= result expected-output))))

(test/deftest counting-valleys-test
  (let [input [8 "UDDDUDUU"]
        expected-output 1
        result (apply counting-valleys/execute input)]
    (test/is (= result expected-output))))

