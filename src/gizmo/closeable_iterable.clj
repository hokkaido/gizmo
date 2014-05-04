(ns gizmo.closeable-iterable
  (:import (com.tinkerpop.blueprints CloseableIterable)))

(defn close!
  [^CloseableIterable closeable]
  (.close closeable))