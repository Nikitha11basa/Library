in ec2 instance install java using these commands - 
1. sudo apt update
2. sudo apt install openjdk-17-jdk -y
3. java -version

4. sudo update-alternatives --config java

Once you have the path (e.g., /usr/lib/jvm/java-11-openjdk-amd64), set the JAVA_HOME environment variable:

Copy code -

5. echo "export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64" >> ~/.bashrc
6. echo "export PATH=\$PATH:\$JAVA_HOME/bin" >> ~/.bashrc
7. source ~/.bashrc

8. echo $JAVA_HOME

output should be - /usr/lib/jvm/java-11-openjdk-amd64


----------------------------------

 to execute code files - 

 firstlt complie it using commands -
 1. javac Book.java
 2. javac Member.java
 3. javac Library.java
 4. javac Main.java

 to run the code  use command -
 1. java Main