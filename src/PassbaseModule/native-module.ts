import { NativeModules } from 'react-native'

export const NativeModule = NativeModules.RNPassbaseModule as {
  readonly show: (message: string) => void
}
