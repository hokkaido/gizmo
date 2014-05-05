(ns gizmo.edge-test
  (:require [clojure.test :refer :all]
            [gizmo.graph :as g]
            [gizmo.vertex :as v]
            [gizmo.edge :as e])
  (:import  (com.tinkerpop.blueprints Element TransactionalGraph TransactionalGraph$Conclusion Features)
            (com.tinkerpop.blueprints.impls.tg TinkerGraphFactory TinkerGraph)))


(deftest test-edge-add
  (testing "test-edge-add"
    (let [graph (TinkerGraphFactory/createTinkerGraph)
          a     (g/add-vertex! graph "Vertex A")
          b     (g/add-vertex! graph "Vertex B")
          c     (g/add-vertex! graph "Vertex C")
          ab    (g/add-edge! graph "Edge AB" a b "Edge AB")]
    (is (= (g/get-edge graph "Edge AB") ab)))))


(deftest test-edge-properties
  (testing "test-edge-prop"
    (let [graph (TinkerGraphFactory/createTinkerGraph)
          a     (g/add-vertex! graph "Vertex A")
          b     (g/add-vertex! graph "Vertex B")
          ab    (g/add-edge! graph "Edge AB" a b "Edge AB")
          prop  (e/set-property! ab "name" "Zubayaso")]
    (is (= (e/get-property ab "name") "Zubayaso")))))


(deftest test-edge-properties
  (testing "test-edge-get-id"
    (let [graph (TinkerGraphFactory/createTinkerGraph)
          a     (g/add-vertex! graph "Vertex A")
          b     (g/add-vertex! graph "Vertex B")
          ab    (g/add-edge! graph "Edge AB" a b "Edge AB Label")
          id    (e/get-id ab)]
    (is (= id "Edge AB" )))))