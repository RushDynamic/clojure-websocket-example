(ns clojure-websocket-example.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [clojure-websocket-example.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojure-websocket-example started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-websocket-example has shut down successfully]=-"))
   :middleware wrap-dev})
