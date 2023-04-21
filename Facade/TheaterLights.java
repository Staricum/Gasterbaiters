/// <summary>
    /// освещение
    /// </summary>
    class TheaterLights
    {
        private string description;

        /// <summary>
        /// Initializes a new instance of the <see cref="TheaterLights"/> class.
        /// </summary>
        /// <param name="description">The description.</param>
        public TheaterLights(string description)
        {
            this.description = description;
        }

        /// <summary>
        /// Ons this instance.
        /// </summary>
        public void on()
        {
            System.out.println(description + " on");
        }

        /// <summary>
        /// Offs this instance.
        /// </summary>
        public void off()
        {
            System.out.println(description + " off");
        }

        /// <summary>
        /// Dims the specified level.
        /// </summary>
        /// <param name="level">The level.</param>
        public void dim(int level)
        {
            System.out.println(description + " dimming to " + level + "%");
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

