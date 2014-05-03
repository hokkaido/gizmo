(ns gizmo.indexable-graph
  (:import com.tinkerpop.blueprints IndexableGraph))

(defn create-index!
  [^IndexableGraph graph indexName indexClass params]
  (.createIndex graph indexName indexClass (into-array String params)))

(defn get-index
  [^IndexableGraph graph indexName indexClass]
  (.getIndex graph indexName indexClass))

(defn get-indices
  [^IndexableGraph graph]
  (.getIndices graph))

(defn drop-index!
  [^IndexableGraph graph]
  (.dropIndex graph))