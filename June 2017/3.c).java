class StringBuilder {
    String content;

    public StringBuilder append(String text) {
        this.content += text;
        return this; // Allow chaining calls (e.g., builder.append("hello").append("world"))
    }
}

