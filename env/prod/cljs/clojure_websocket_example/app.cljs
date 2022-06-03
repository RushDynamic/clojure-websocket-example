(ns clojure-websocket-example.app
  (:require [clojure-websocket-example.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
