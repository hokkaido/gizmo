(ns gizmo.contains
  (:refer-clojure :exclude [keys first second])
  (:import (com.tinkerpop.blueprints Contains)))

(def in
  (Contains/IN))

(def not-in
  (Contains/NOT_IN))

(defn evaluate?
  [^Contains contains first second]
  (.evaluate contains first second))

(defn opposite
  [^Contains contains]
  (.opposite contains))