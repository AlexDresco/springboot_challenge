import React from 'react';

class Input extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="input_buttons">
                <h1>Let's play</h1>
                <button>Rock</button>
                <button>Paper</button>
                <button>Scissors</button>
            </div>
        );
    }
}

export default Input;