/// <summary>
    /// экран
    /// </summary>
    class Screen
    {
        private string description;

        /// <summary>
        /// Initializes a new instance of the <see cref="Screen"/> class.
        /// </summary>
        /// <param name="description">The description.</param>
        public Screen(string description)
        {
            this.description = description;
        }

        /// <summary>
        /// Ups this instance.
        /// </summary>
        public void up()
        {
            System.out.println(description + " going up");
        }

        /// <summary>
        /// Downs this instance.
        /// </summary>
        public void down()
        {
            System.out.println(description + " going down");
        }

        /// <summary>
        /// Converts to string.
        /// </summary>
        /// <returns>
        /// A <see cref="System.String" /> that represents this instance.
        /// </returns>
        public string ToString()
        {
            return description;
        }
}

