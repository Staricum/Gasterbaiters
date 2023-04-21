class Tuner
{
        private string description;
        private Amplifier amplifier;
        private double frequency;

        /// <summary>
        /// Initializes a new instance of the <see cref="Tuner"/> class.
        /// </summary>
        /// <param name="description">The description.</param>
        /// <param name="amplifier">The amplifier.</param>
        public Tuner(string description, Amplifier amplifier)
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
        /// Sets the frequency.
        /// </summary>
        /// <param name="frequency">The frequency.</param>
        public void setFrequency(double frequency)
        {
            Console.WriteLine(description + " setting frequency to " + frequency);
            this.frequency = frequency;
        }

        /// <summary>
        /// Sets the am.
        /// </summary>
        public void setAm()
        {
            Console.WriteLine(description + " setting AM mode");
        }

        /// <summary>
        /// Sets the fm.
        /// </summary>
        public void setFm()
        {
            Console.WriteLine(description + " setting FM mode");
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