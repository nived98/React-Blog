import { useDispatch, useSelector } from "react-redux";
import { incement } from "./actions";

function App() {
  const counter = useSelector(state => state.counterReducer)
  const dispatch = useDispatch();
  return (
    <div className="App">
      <h1>Counter - {counter}</h1>
      <button onClick={() => dispatch(incement())}>+</button>
    </div>
  );
}

export default App;
