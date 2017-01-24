(ns user
  (:require [arachne.core :as arachne]
            [com.stuartsierra.component :as c]))

(def cfg (arachne/config :ui/app))
(def rt (arachne/runtime cfg :ui/runtime))
(def handle (atom nil))

(defn start! []
  (swap! handle (c/start rt)))

(defn stop! [] (c/stop (deref handle)))
