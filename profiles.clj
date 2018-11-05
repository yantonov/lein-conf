{:user
 {:plugins [[lein-cljfmt "0.6.1"] ; reformat
            [lein-ancient "0.6.15"] ; check out-of-date artifact
            [venantius/ultra "0.5.2"] ; pretty print test output, stacktraces
            [lein-kibit "0.1.6"] ; lint
            [jonase/eastwood "0.3.3"] ; lint
            [venantius/yagni "0.1.6"] ; check dead code
            [lein-bikeshed "0.5.1"] ; another lint tool
            [lein-auto "0.1.3"] ; watches the project source directories, and executes a task when it detects changes to files matching a set pattern
            ]
  }
 :repl
 {:dependencies [[org.clojure/tools.namespace "0.2.11"] ; reload ns
                 [alembic "0.3.2"]
                 [org.clojure/tools.nrepl "0.2.13"]
                 ]
  :plugins [[refactor-nrepl "2.4.0"]
            [cider/cider-nrepl "0.18.0"]]
  :injections [(require '[clojure.tools.namespace.repl :refer [refresh]])
               (refresh)
               (require 'alembic.still)
               (use 'clojure.repl)
               (use 'clojure.java.javadoc)]
  }}
