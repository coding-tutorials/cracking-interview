(ns crackin.00-tests
  (:require [clojure.test :as test])
  (:require [crackin.00-sock-merchant :as sock-merchant])
  (:require [crackin.00-repeated-string :as repeated-string])
  (:require [crackin.00-jumping-on-the-clouds :as jumping-on-the-clouds])
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

(test/deftest jumping-on-the-clouds-test
  (let [input [[0 0 1 0 0 1 0]]
        expected-output 4
        result (apply jumping-on-the-clouds/execute input)]
    (test/is (= result expected-output))))

(test/deftest repeated-string-test
  (let [input ["aba" 10]
        expected-output 7
        result (apply repeated-string/execute input)]
    (test/is (= result expected-output))))

