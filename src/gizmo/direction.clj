(ns gizmo.direction
  (:import com.tinkerpop.blueprints Direction))


(def in
  (Direction/IN))

(def out
  (Direction/OUT))

(def both
  (Direction/BOTH))

(defn opposite
  [^Direction direction]
  (.opposite direction))