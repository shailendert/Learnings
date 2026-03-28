# Phase 1: Code Review Tool (Rule-Based, No AI)

## Objective
Build a **rule-based code review tool for Java** that:
* Reads a Java file
* Applies predefined rules (coding conventions)
* Outputs issues and suggestions
* Runs locally via command line
This phase is strictly **non-AI**. Focus on deterministic logic.
---
## Scope (Strict)
### Included
* Java file input
* Rule-based validation
* Config-driven rules
* CLI execution
* Aggregated output
### Excluded
* AI/LLM integration
* PR automation
* Multi-language support
* IDE plugins
* Line-level suggestions (later phase)
---
## Tech Stack
* Java 17+
* Maven or Gradle
* Basic file parsing (no heavy AST initially)
---
## Step 1: GitHub Repository Setup
### Repo Structure
```
code-review-ai/
 ├── phase-1/
 │    ├── src/
 │    ├── rules/
 │    ├── samples/
 │    ├── output/
 │    └── README.md
 └── .gitignore
```
## Step 2: Project Setup (Java)

### Using Maven

```bash
mvn archetype:generate
```

### Basic Structure

```
src/main/java/com/review/
 ├── Main.java
 ├── analyzer/
 ├── rules/
 └── model/
```

---

## Step 3: Core Components

### 1. Input Reader

Reads Java file

### 2. Rule Engine

* Loads rules from file
* Applies rules sequentially

### 3. Rule Definitions

Each rule:

* Name
* Description
* Check logic
* Priority

### 4. Output Formatter

* Aggregates results
* Prints issues

---

## Step 4: Rules Configuration

Create:

### rules/rules.json

```json
[
  {
    "name": "VariableNaming",
    "description": "Variables should be camelCase",
    "priority": 1
  },
  {
    "name": "NoSystemOut",
    "description": "Avoid System.out.println",
    "priority": 2
  }
]
```

---

## Step 5: Sample Input

### samples/sample1.java

```java
public class Test {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(A);
    }
}
```

---

## Step 6: Main Execution Flow

### Main.java (Pseudo Flow)

1. Read file path from args
2. Load rules
3. Parse file (line-by-line initially)
4. Apply rules
5. Collect violations
6. Print results

---

## Step 7: Run the Tool

```bash
java -jar code-review.jar samples/sample1.java
```

---

## Step 8: Output Format

```
Issues Found:

1. VariableNaming
   - Variable 'A' should be camelCase

2. NoSystemOut
   - Avoid using System.out.println
```

---

## Step 9: Git Discipline
Commits:
```
feat: initial project setup
feat: file input handling
feat: rule engine
feat: rule config
feat: sample input
feat: output formatter
```

## Step 10: Completion Checklist

* [ ] CLI accepts file input
* [ ] Rules loaded from config
* [ ] Rules applied correctly
* [ ] Output shows violations
* [ ] Code structured cleanly
