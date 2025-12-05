# Simple Inventory Tracker

## 2. Functional & Non-Functional Requirements

**Functional Requirements:**

- **FR1:** User can add an item via form (name, quantity, price) → Stored in array (backend simulation).
- **FR2:** Display all items in a table (columns: Name, Qty, Price, Total Value).
- **FR3:** Show items as an unordered list for quick scan.
- **FR4:** Basic search: Loop through array to find item by name (case-insensitive partial match).
- **FR5:** Calculate total inventory value (sum via loop).

**Non-Functional Requirements:**

- **NFR1:** UI responsive on desktop/mobile (basic CSS).
- **NFR2:** Code readable, with comments; encapsulation hides data details.
- **NFR3:** Performance: O(n) operations acceptable for <100 items (early arrays limit).
- **NFR4:** Accessibility: Semantic HTML (e.g., `<table>`, `<form>`, `<ul>` for screen readers).
- **NFR5:** Polyglot depth: Core logic in Java; equivalent array ops in Python (for DSA comparison—extend to Go/Rust in future weeks).

**Assumptions:** No persistence (in-memory arrays); manual "refresh" simulates backend call.

---
