.DEFAULT_GOAL := apdemo
apdemo:
	javac --release 13 -d target/classes -sourcepath ./src/main/java -cp .:target/classes src/main/java/ru/otus/l9/annotations/processor/AnnotationProcessor.java
	javac --release 13 -d target/classes -sourcepath ./src/main/java -cp .:target/classes -processor ru.otus.l9.annotations.processor.AnnotationProcessor src/main/java/ru/otus/l9/annotations/processor/DataClass.java
