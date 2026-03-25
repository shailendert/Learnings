# Code Review AI Tool – Critical Thinking (Day 1)

## 1. Defining the Problem

What do I need to build?

I am planning on building a new code review AI tool.

This tool will help review code using:

* A plugin
* Auto-review PRs if added to build servers

---

## 2. Decomposition

This will be completed in phases.

### Phase 1

* Review Java code using static analysis and linting
* Start with Java since I mostly work on it
* Manual trigger (run via .bat or .exe from command line)
* Check coding conventions using a file

---

### Phase 2

* Add capability to specify required conventions in a file

---

### Phase 3

* Add support for Python and C#
* Static analysis and linting

---

### Phase 4

* Ensure code follows:

  * SOLID principles
  * Clean architecture
* Provide suggestions for improvement

---

### Phase 5

* Better reasoning and suggestions
* Improve quality of comments

---

### Phase 6

* Add AI-assisted review
* Provide optional assist mode

---

## 3. How It Should Work

### Input

* Initially: file input
* Later: improve to check diffs and PRs

---

### File Parsing

* File should be parsed in steps

* Initially allow longer processing time

* Gradually reduce delay

* Parser should:

  * Use rule-based analysis
  * Read rules from a file
  * Apply rules based on priority

---

## 4. Output

* Initially provide complete result together
* Later provide line-level suggestions

---

## 5. Execution

* Write a code file

* Run the code review tool

* Tool lists suggestions

* On build servers:

  * Tool should run automatically

---

## 6. Analysis Scope

The tool should:

* Check syntax
* Check semantics
* Check design (via rule file)
* Check architecture (via rule file)
* Follow SOLID and CLEAN principles

---

## 7. Why This Tool Should Be Used

* Helps review code before human review
* Ensures coding conventions
* Catches issues quickly
* Improves design and architecture quality
* Improves readability, scalability, maintainability
* Can automatically improve code (future)
