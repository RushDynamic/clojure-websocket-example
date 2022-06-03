(ns clojure-websocket-example.core-test
  (:require [cljs.test :refer-macros [is are deftest testing use-fixtures]]
            [pjstadig.humane-test-output]
            [clojure-websocket-example.core :as rc]))

(deftest test-home
  (is (= true true)))

