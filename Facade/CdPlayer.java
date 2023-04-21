/// <summary>
    /// класс для работы с CD проигрывателем
    /// </summary>
    class CdPlayer
    {
        private string description;
        private int currentTrack;
        private Amplifier amplifier;
        private string title;

        /// <summary>
        /// Initializes a new instance of the <see cref="CdPlayer"/> class.
        /// </summary>
        /// <param name="description">The description.</param>
        /// <param name="amplifier">The amplifier.</param>
        public CdPlayer(string description, Amplifier amplifier)
        {
            this.description = description;
            this.amplifier = amplifier;
        }

        /// <summary>
        /// Ons this instance.
        /// </summary>
        public void on()
        {
            Console.WriteLine(description + " on");
        }

        /// <summary>
        /// Offs this instance.
        /// </summary>
        public void off()
        {
            Console.WriteLine(description + " off");
        }

        /// <summary>
        /// Ejects this instance.
        /// </summary>
        public void eject()
        {
            title = null;
            Console.WriteLine(description + " eject");
        }

        /// <summary>
        /// Plays the specified title.
        /// </summary>
        /// <param name="title">The title.</param>
        public void play(string title)
        {
            this.title = title;
            currentTrack = 0;
            Console.WriteLine(description + " playing \"" + title + "\"");
        }

        /// <summary>
        /// Plays the specified track.
        /// </summary>
        /// <param name="track">The track.</param>
        public void play(int track)
        {
            if (title == null)
            {
                Console.WriteLine(description + " can't play track " + currentTrack + ",  no cd inserted");
            }
            else
            {
                currentTrack = track;
                Console.WriteLine(description + " playing track " + currentTrack);
            }
        }

        /// <summary>
        /// Stops this instance.
        /// </summary>
        public void stop()
        {
            currentTrack = 0;
            Console.WriteLine(description + " stopped");
        }

        /// <summary>
        /// Pauses this instance.
        /// </summary>
        public void pause()
        {
            Console.WriteLine(description + " paused \"" + title + "\"");
        }

        /// <summary>
        /// Converts to string.
        /// </summary>
        /// <returns>
        /// A <see cref="System.String" /> that represents this instance.
        /// </returns>
        public override string ToString()
        {
            return description;
        }
    }
}