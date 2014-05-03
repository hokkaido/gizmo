(ns gizmo.features
  (:refer-clojure :exclude [keys])
  (:import com.tinkerpop.blueprints Features))

(defn supports-duplicate-edges? 
  [^Features features]
  (.supportsDuplicateEdges features))

(defn supports-self-loops? 
  [^Features features]
  (.supportsSelfLoops features))

(defn supports-serializable-object-property? 
  [^Features features]
  (.supportsSerializableObjectProperty features))

(defn supports-boolean-property? 
  [^Features features]
  (.supportsBooleanProperty features))

(defn supports-double-property? 
  [^Features features]
  (.supportsDoubleProperty features))

(defn supports-float-property? 
  [^Features features]
  (.supportsFloatProperty features))

(defn supports-integer-property? 
  [^Features features]
  (.supportsIntegerProperty features))

(defn supports-primitive-Array-property? 
  [^Features features]
  (.supportsPrimitiveArrayProperty features))

(defn supports-uniform-list-property? 
  [^Features features]
  (.supportsUniformListProperty features))

(defn supports-mixed-list-property? 
  [^Features features]
  (.supportsMixedListProperty features))

(defn supports-long-property? 
  [^Features features]
  (.supportsLongProperty features))

(defn supports-map-property? 
  [^Features features]
  (.supportsMapProperty features))

(defn supports-string-property? 
  [^Features features]
  (.supportsStringProperty features))

(defn has-implicit-elements? 
  [^Features features]
  (.hasImplicitElements features))



(defn ignores-supplied-ids? 
  [^Features features]
  (.ignoresSuppliedIds features))

(defn is-persistent? 
  [^Features features]
  (.isPersistent features))

(defn is-wrapper? 
  [^Features features]
  (.isWrapper features))

(defn supports-indices? 
  [^Features features]
  (.supportsIndices features))

(defn supports-vertex-index? 
  [^Features features]
  (.supportsVertexIndex features))

(defn supports-edge-index? 
  [^Features features]
  (.supportsEdgeIndex features))

(defn supports-key-indices? 
  [^Features features]
  (.supportsKeyIndices features))

(defn supports-vertex-key-index? 
  [^Features features]
  (.supportsVertexKeyIndex features))

(defn supports-edge-key-index? 
  [^Features features]
  (.supportsEdgeKeyIndex features))

(defn supports-edge-iteration? 
  [^Features features]
  (.supportsEdgeIteration features))

(defn supports-vertex-iteration? 
  [^Features features]
  (.supportsVertexIteration features))

(defn supports-edge-retrieval? 
  [^Features features]
  (.supportsEdgeRetrieval features))

(defn supports-vertex-properties? 
  [^Features features]
  (.supportsVertexProperties features))

(defn supports-edge-properties? 
  [^Features features]
  (.supportsEdgeProperties features))

(defn supports-transactions? 
  [^Features features]
  (.supportsTransactions features))

(defn supports-threaded-transactions? 
  [^Features features]
  (.supportsThreadedTransactions features))

(defn supports-element-properties? 
  [^Features features]
  (.supportsElementProperties features))

(defn to-string
  [^Features features]
  (.toString features))

(defn to-map
  [^Features features]
  (.toMap features))

(defn check-compliance
  [^Features features]
  (.checkCompliance features))

(defn copy-features
  [^Features features]
  (.copyFeatures features))