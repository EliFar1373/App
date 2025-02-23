import React, { useState } from 'react';

function NameForm() {
    const [name, setName] = useState('');
  
    function handleChange(event) {
      setName(event.target.value);
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        alert(`Hello, ${name}!`);
      };
  
    return (
        <form onSubmit={handleSubmit}>

        <label>
          Name:
          <input type="text" value={name} onChange={handleChange} />
        </label>
        <button type="submit">Greet</button>
      </form>
    );
  }
  
  export default NameForm;