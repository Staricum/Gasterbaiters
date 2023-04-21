/// <summary>
    /// проектор
    /// </summary>
    class Projector
    {
        private string description;
        private DvdPlayer dvdPlayer;

        /// <summary>
        /// Initializes a new instance of the <see cref="Projector"/> class.
        /// </summary>
        /// <param name="description">The description.</param>
        /// <param name="dvdPlayer">The DVD player.</param>
        public Projector(string description, DvdPlayer dvdPlayer)
        {
            this.description = description;
            this.dvdPlayer = dvdPlayer;
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
        /// Wides the screen mode.
        /// </summary>
        public void wideScreenMode()
        {
            System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
        }

        /// <summary>
        /// Tvs the mode.
        /// </summary>
        public void tvMode()
        {
            System.out.println(description + " in tv mode (4x3 aspect ratio)");
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
