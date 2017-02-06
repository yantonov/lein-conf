{:user
 {:dependencies [[pjstadig/humane-test-output "0.8.1"]]
  :plugins [[lein-cljfmt "0.5.6"] ; reformat
            [lein-ancient "0.6.10"] ; check out-of-date artifact
            [venantius/ultra "0.5.1"] ; pretty print test output, stacktraces
            [lein-kibit "0.1.3"] ; lint
            [jonase/eastwood "0.2.3"] ; lint
            [venantius/yagni "0.1.4"] ; check dead code
            [lein-bikeshed "0.4.1"]] ; another lint tool
  :injections [(use 'clojure.repl)
               (use 'clojure.java.javadoc)
               (require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]}
 :repl
 {:dependencies [[alembic "0.3.2"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :plugins [[refactor-nrepl "2.2.0"]
            [cider/cider-nrepl "0.14.0"]]
  :injections [(use 'clojure.repl)
               (use 'clojure.java.javadoc)
               (require 'alembic.still)]}}
