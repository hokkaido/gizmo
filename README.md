# gizmo
Gizmo is a transparent wrapper for Tinkerpop Blueprints API. This library doesn't introduce new functionality when it comes to the Blueprints API.

## Gotchas
The aim of this library is to provide a *transparent* wrapper for the Tinkerpop Blueprints API. What does this mean? A short example:

Blueprint's Graph interface defines two methods called getVertices which both return an Iterable<Vertex>. 

```
public Iterable<Vertex> getVertices();
public Iterable<Vertex> getVertices(String key, Object value);
```

Our wrapper function does *not* coerce this into a Clojure set or seq. We also do not provide two different wrapper functions (for instance get-all-vertices and get-vertices), instead we do this:

```
(defn get-vertices
  "Returns an iterable to all the vertices in the graph. If this is not possible 
  for the implementation, then an UnsupportedOperationException can be thrown."
  ([^Graph graph] 
    (.getVertices graph))
  ([^Graph graph key value]
    (.getVertices graph key value)))
```

## License
The gizmo library is licenced under the MIT License.
