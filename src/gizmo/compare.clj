(ns gizmo.compare
  (:refer-clojure :exclude [compare first second])
  (:import com.tinkerpop.blueprints Compare))

(defn evaluate?
  [^Compare compare first second]
  (.evaluate compare first second))

(defn opposite
  [^Compare compare]
  (.opposite compare))

(defn as-string
  [^Compare compare]
  (.asString compare))

(defn as-string
  [^Compare compare]
  (.asString compare))

