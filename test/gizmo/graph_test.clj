(ns gizmo.graph-test
  (:require [clojure.test :refer :all]
            [gizmo.graph :as :g])
  (:import  (com.tinkerpop.blueprints Element TransactionalGraph TransactionalGraph$Conclusion Features)
            (com.tinkerpop.blueprints.impls.tg TinkerGraphFactory TinkerGraph)))
  
(deftest test-graph-features
  (testing "getFeatures()"
    (let [graph (TinkerGraphFactory/createTinkerGraph)]
    (is (= (type com.tinkerpop.blueprints.Features) g/get-features(graph))))))