import counterReducer from './counter'
import loggerReducer from './isLogged'
import {combineReducers} from 'redux'

const allReducer = combineReducers({
  counterReducer,
  loggerReducer
})

export default allReducer