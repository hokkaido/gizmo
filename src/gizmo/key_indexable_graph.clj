(ns gizmo.key-indexable-graph
  (:refer-clojure :exclude [keys])
  (:import com.tinkerpop.blueprints KeyIndexableGraph Parameter))

(defn drop-key-index!
  [^KeyIndexableGraph graph key elementClass]
  (.dropKeyIndex graph key elementClass))

(defn create-key-index!
  [^KeyIndexableGraph graph key elementClass indexParameters]
  (.createKeyIndex graph key elementClass (into-array ^Parameter indexParameters)))

(defn get-indexed-keys
  [^KeyIndexableGraph graph elementClass]
  (.getIndexedKeys graph elementClass))