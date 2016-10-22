# marklogic-module-deployer-sample-project
A sample maven project that make use of marklogic-module-deployer maven plugin.

# How to use the marklogic-module-deployer plugin in your maven project.
To use the [marklogic-module-deployer] (https://github.com/sanjuthomas/marklogic-module-deployer), clone marklogic-module-deployer from [github ] (https://github.com/sanjuthomas/marklogic-module-deployer)to your local machine and install the artificat into your maven repository.

add the following to your pom.xml and create [ml-server-config.properties] (https://github.com/sanjuthomas/marklogic-module-deployer-sample-project/blob/master/src/main/resources/ml-server-config.properties). 

````
 <build>
    <plugins>
      <plugin>
      	<groupId>org.sanju</groupId>
        <artifactId>marklogic-module-deployer</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <executions>
          <execution>
            <id>deploy-ml-modules</id>
            <phase>install</phase>
            <configuration>
            <mlConfiguration>src/main/resources/ml-server-config.properties</mlConfiguration>
            </configuration>
            <goals>
              <goal>ml-module-deployer</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
  
````
