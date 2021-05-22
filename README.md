# HealthCloudAI-Arintra-
Programming language to use: Java 

Assignment:
You have a dictionary of symptoms. Some are top level symptoms (Abdominal
pain, Chest Pain) and others are children connected to these parents by
relationships.
Example: &#39;Abdominal pain, right upper quadrant&#39; is a child of &#39;Abdominal pain&#39; via
relation &#39;location&#39;, &#39;Abdominal pain, mild&#39; is a child of &#39;Abdominal Pain&#39; via relation
&#39;severity&#39;.

Dictionary:
Abdominal pain
Abdominal pain, right upper quadrant
Abdominal pain, right lower quadrant
Abdominal pain, left upper quadrant
Abdominal pain, right upper quadrant
Abdominal pain, mild
Abdominal pain, moderate
Abdominal pain, severe
Chest pain
Chest pain, left side
Chest pain, right side
Chest pain, mild
Chest pain, moderate
Chest pain, severe

Tasks:
1. Create the symptoms tree and print it.
Output:
Root
--symptom--Abdominal pain

--location--Abdominal pain, right upper quadrant
--location--Abdominal pain, right lower quadrant
--location--Abdominal pain, left upper quadrant
--location--Abdominal pain, right upper quadrant
--severity--Abdominal pain, mild
--severity--Abdominal pain, moderate
--severity--Abdominal pain, severe

--symptom--Chest pain

--location--Chest pain, left side
--location--Chest pain, right side
--severity--Chest pain, mild
--severity--Chest pain, moderate
--severity--Chest pain, severe

2. Now, you have created the tree. Given a child node, find all the siblings of this
node.
Input 1:
Abdominal pain, right upper quadrant
Output 1:
Abdominal pain, right lower quadrant
Abdominal pain, left upper quadrant
Abdominal pain, right upper quadrant
Abdominal pain, mild
Abdominal pain, moderate
Abdominal pain, severe
Input 2:
Abdominal pain
Output 2:

Chest pain
